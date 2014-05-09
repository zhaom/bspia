package com.meidusa.demo.web.listener;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;
import java.util.TimerTask;

import javax.servlet.ServletContext;

import org.apache.log4j.Logger;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.meidusa.demo.dal.EnterpriseInfoDAO;
import com.meidusa.demo.dal.model.EnterpriseInfo;
import com.meidusa.demo.dal.model.EnterpriseInfoExample;



public class JobTimer extends TimerTask {
	
	public static Logger log = Logger.getLogger(JobTimer.class);
	
	private ServletContext context;
	
	private EnterpriseInfoDAO enterpriseDAO;
	

	public JobTimer(ServletContext servletContext) {
		this.context = servletContext;
		this.enterpriseDAO=(EnterpriseInfoDAO)WebApplicationContextUtils.getWebApplicationContext(servletContext).getBean("enterpriseDAO");
	}

	@Override
	public void run() {

		Date nowDate = new Date();
		int nowHour = nowDate.getHours();
		if (nowHour > 15 || nowHour < 17) {
			log.info("now is in the acceptable timeslice, so the scheduled job just do.");
			Connection ssCon = null;
			PreparedStatement ps = null;
			ResultSet rs = null;
			try {
				ssCon = getNewSQLServerConnection(ssCon);
				ps = ssCon.prepareStatement("select * from dbo.t_company");
				rs = ps.executeQuery();
				
				int totalCount = 0;
				int insertSuccessCount = 0;
				int updateSuccessCount = 0;
				int failedCount = 0;
				
				while (rs.next()) {
					totalCount++;
					try {
						String companyName = rs.getString("company_name");
						EnterpriseInfo enterprise = null;
						EnterpriseInfoExample example = new EnterpriseInfoExample();
						if (companyName == null || companyName.isEmpty()) {
							example.createCriteria().andIdIsNotNull();
						} else {
							example.createCriteria().andNameLike(
									"%" + companyName + "%");
						}
						List<EnterpriseInfo> oldEnterpriseList = this.enterpriseDAO
								.selectByExampleWithBLOBs(example);
						if (oldEnterpriseList == null
								|| oldEnterpriseList.isEmpty()) {
							enterprise = new EnterpriseInfo();
							insertEntry(rs,enterprise);
							insertSuccessCount++;
						} else {
							enterprise = oldEnterpriseList.get(0);
							updateEntry(rs,enterprise);
							updateSuccessCount++;
						}
					} catch (Exception e) {
						log.error("index "+totalCount+"something error:"+e.getMessage());
						failedCount++;
					}
				}
				log.info("reload enterprise info success,total count:"+totalCount
						+" insertSuccessCount"+insertSuccessCount+" updateSuccessCount:"+updateSuccessCount+" failedCount:"+failedCount);
			} catch (SQLException e) {
				log.error("failed update enterprise info!");
			} finally{
				try {
					if(rs!=null && !rs.isClosed()){
						rs.close();
					}
					if(ps!=null && !ps.isClosed()){
						ps.close();
					}
					if(ssCon!=null && !ssCon.isClosed()){
						ssCon.close();
					}
				} catch (SQLException e) {
					log.error("error in close conneciton!");
				}
			}

		} else {
			log.info("now is not the acceptable time,so the scheduled job do nothing.");
		}
	}

	private void updateEntry(ResultSet rs, EnterpriseInfo enterprise) throws SQLException {
		orgData(rs,enterprise);
		this.enterpriseDAO.updateByPrimaryKeySelective(enterprise);
	}


	private void insertEntry(ResultSet rs, EnterpriseInfo enterprise) throws SQLException {
		orgData(rs,enterprise);
		this.enterpriseDAO.insert(enterprise);
	}
	
	private void orgData(ResultSet rs, EnterpriseInfo enterprise) throws SQLException {
		String register_addr = rs.getString("register_addr");
		String company_addr = rs.getString("company_addr");
		String postcode = rs.getString("postcode");
		
		enterprise.setRegisteraddr(register_addr);
		enterprise.setOfficeaddr(company_addr);
		enterprise.setAddress(company_addr);
		enterprise.setZip(postcode);
		
		String enrollment_date = rs.getString("enrollment_date");
		String email = rs.getString("email");
		String register_date = rs.getString("register_date");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date d = sdf.parse(enrollment_date);
			enterprise.setEnrolltime(d);
			d = sdf.parse(register_date);
			enterprise.setRegistertime(d);
		} catch (Exception e) {
			log.error("#####pase date error! "+enterprise.getName());
		}
		
		String register_capital = rs.getString("register_capital");
		String tatal_assets = rs.getString("tatal_assets");
		String business_income = rs.getString("business_income");
		String net_profit = rs.getString("net_profit");
		String total_person = rs.getString("total_person");
		String bachelor_or_above = rs.getString("bachelor_or_above");
		String senior_person = rs.getString("senior_person");
		String middle_person = rs.getString("middle_person");
		String primary_person = rs.getString("primary_person");
		String technician_person = rs.getString("technician_person");
		String legal_form = rs.getString("legal_form");
		String other1 = rs.getString("other1");
		String legal_representative = rs.getString("legal_representative");
		String telephone = rs.getString("telephone");
		String mobile_telephone = rs.getString("mobile_telephone");
		String link_man = rs.getString("link_man");
		String telephone2 = rs.getString("telephone2");
		String mobile_telephone2 = rs.getString("mobile_telephone2");
		String fax = rs.getString("fax");
		String url = rs.getString("url");
		
		
		
		enterprise.setEmail(email);
		enterprise.setRegistercapital(Integer.valueOf(register_capital.equals("") ? "0" : register_capital));
		
		enterprise.setTotalassets(Double.valueOf(tatal_assets
				.equals("") ? "0" : tatal_assets));
		enterprise.setBusinessincome(Double.valueOf(business_income
				.equals("") ? "0" : business_income));
		enterprise.setNetprofit(Double.valueOf(net_profit
				.equals("") ? "0" : net_profit));
		enterprise.setEmployeetotal(Integer.valueOf(total_person
				.equals("") ? "0" : total_person));
		enterprise.setBachelortotal(Integer.valueOf(bachelor_or_above
				.equals("") ? "0" : bachelor_or_above));
		enterprise.setSeniortotal(Integer.valueOf(senior_person
				.equals("") ? "0" : senior_person));
		enterprise.setMiddletotal(Integer.valueOf(middle_person
				.equals("") ? "0" : middle_person));
		enterprise.setJuniortotal(Integer.valueOf(primary_person
				.equals("") ? "0" : primary_person));
		enterprise.setTechnicianstotal(Integer.valueOf(technician_person
				.equals("") ? "0" : technician_person));
		enterprise.setNatureid(legal_form.equals("") ? "29"
				: legal_form);
		enterprise.setNatureotherdesc(other1);
		enterprise.setLegalrepresentative(legal_representative);
		enterprise.setLegalrepresentativetele(telephone);
		enterprise.setLegalrepresentativemobile(mobile_telephone);
		enterprise.setLinkman(link_man);
		enterprise.setPhone(telephone2);
		enterprise.setMobilephone(mobile_telephone2);
		enterprise.setFax(fax);
		enterprise.setUrl(url);
		
		
		
		String business_model = rs.getString("business_model");
		String fire_protection_level = rs.getString("fire_protection_level");
		String confidential_si_level = rs.getString("confidential_si_level");
		String ib_si_level = rs.getString("ib_si_level");
		String ib_contract_construction = rs.getString("ib_contract_construction");
		String info_si_level = rs.getString("info_si_level");
		String aptitudes = rs.getString("aptitudes");
		String quality_certificate = rs.getString("quality_certificate");
		String other2 = rs.getString("other2");
		String enterprise_credit = rs.getString("enterprise_credit");
		String member_type = rs.getString("member_type");
		String applying_level = rs.getString("applying_level");
		
		
		if (business_model.indexOf(",9,") != -1) {
			enterprise.setOmprodprod("checked");
		}
		if (business_model.indexOf(",10,") != -1) {
			enterprise.setOmprodsale("checked");
		}
		if (business_model.indexOf(",11,") != -1) {
			enterprise.setOmprojmaint("checked");
		}
		if (business_model.indexOf(",12,") != -1) {
			enterprise.setOmnetalarm("checked");
		}
		if (business_model.indexOf(",13,") != -1) {
			enterprise.setOmsptain("checked");
		}
		if (business_model.indexOf(",14,") != -1) {
			enterprise.setOmmedia("checked");
		}
		if (business_model.indexOf(",15,") != -1) {
			enterprise.setOmprojconstruct("checked");
		}
		if (business_model.indexOf(",16,") != -1) {
			enterprise.setOmother("checked");
		}
		enterprise
				.setQualifacationgetfire(fire_protection_level.equals("") ? "17"
						: fire_protection_level);
		enterprise
				.setQualifacationgetconf(confidential_si_level.equals("") ? "26"
						: confidential_si_level);
		enterprise.setQualifacationgetbuildinte(ib_si_level
				.equals("") ? "26" : ib_si_level);
		enterprise.setQualifacationgetbuildproj(ib_contract_construction
				.equals("") ? "17" : ib_contract_construction);
		enterprise.setQualifacationgetitinte(info_si_level
				.equals("") ? "21" : info_si_level);

		enterprise
				.setSpqualifacationlevel(aptitudes.equals("") ? "17"
						: aptitudes);

		enterprise
				.setQualitycertifacation(quality_certificate.equals("") ? "52"
						: quality_certificate);
		enterprise.setQualitycertifacationotherdesc(other2);
		enterprise.setProductbound(enterprise_credit.equals("") ? "62"
				: enterprise_credit);
		enterprise
				.setMembertypeid(member_type.equals("1") ? "ENT_MEM_01"
						: "ENT_MEM_02");
		enterprise
				.setTohighapplylevel(applying_level.equals("") ? "35"
						: applying_level);
		
		
		
		String product_scope = rs.getString("product_scope");
		String application_area = rs.getString("application_area");
		String company_desc = rs.getString("company_desc");
		String create_time = rs.getString("create_time");
		String update_time = rs.getString("update_time");
		String state = rs.getString("state");
		
		
		if (product_scope.indexOf(",39,") != -1) {
			enterprise.setProductboundvideo("checked");
		}
		if (product_scope.indexOf(",40,") != -1) {
			enterprise.setProductboundbangsec("checked");
		}
		if (product_scope.indexOf(",41,") != -1) {
			enterprise.setProductboundaroundalarm("checked");
		}
		if (product_scope.indexOf(",42,") != -1) {
			enterprise.setProductboundtheftalarm("checked");
		}
		if (product_scope.indexOf(",43,") != -1) {
			enterprise.setProductboundentrancecontrol("checked");
		}
		if (product_scope.indexOf(",44,") != -1) {
			enterprise.setProductboundbuildvoice("checked");
		}
		if (product_scope.indexOf(",45,") != -1) {
			enterprise.setProductboundbuildintell("checked");
		}
		if (product_scope.indexOf(",46,") != -1) {
			enterprise.setProductboundvohilealarm("checked");
		}
		if (product_scope.indexOf(",47,") != -1) {
			enterprise.setProductboundbodysec("checked");
		}
		if (product_scope.indexOf(",48,") != -1) {
			enterprise.setProductboundbasesec("checked");
		}
		if (product_scope.indexOf(",49,") != -1) {
			enterprise.setProductbounddooralarm("checked");
		}

		if (application_area.indexOf(",1,") != -1) {
			enterprise.setIndustryboundfiance("checked");
		}
		if (application_area.indexOf(",2,") != -1) {
			enterprise.setIndustryboundculture("checked");
		}
		if (application_area.indexOf(",3,") != -1) {
			enterprise.setIndustryboundeducation("checked");
		}
		if (application_area.indexOf(",4,") != -1) {
			enterprise.setIndustryboundcommu("checked");
		}
		if (application_area.indexOf(",5,") != -1) {
			enterprise.setIndustryboundgov("checked");
		}
		if (application_area.indexOf(",6,") != -1) {
			enterprise.setIndustryboundenterprise("checked");
		}
		if (application_area.indexOf(",7,") != -1) {
			enterprise.setIndustryboundenerge("checked");
		}
		if (application_area.indexOf(",8,") != -1) {
			enterprise.setIndustryboundhome("checked");
		}

		enterprise.setIntroduction(company_desc);
		try {
			Date d = new java.util.Date();
			d.setYear(Integer
					.parseInt(create_time.substring(0, 4)));
			d.setMonth(Integer.parseInt(create_time
					.substring(4, 6)) - 1);
			d.setDate(Integer
					.parseInt(create_time.substring(6, 8)));
			enterprise.setCreateddatetime(d);

			d.setYear(Integer
					.parseInt(update_time.substring(0, 4)));
			d.setMonth(Integer.parseInt(update_time
					.substring(4, 6)) - 1);
			d.setDate(Integer
					.parseInt(update_time.substring(6, 8)));
			enterprise.setLastupdatedatetime(d);
		} catch (Exception e) {
			e.printStackTrace();
		}
		enterprise.setIndustrybound(state.equals("") ? "57"
				: state);
		
		enterprise.setCreatedloginid("admin");
		enterprise.setCreateddatetime(new Date());
		enterprise.setLastupdatedatetime(new Date());
		enterprise.setLastupdateloginid("admin");
		enterprise.setFeepaymentflag("60");
		enterprise.setIpoflag("ENT_IPO_02");
		enterprise.setQualificationsupervision("17");
		enterprise.setQualificationcomputersp("17");
		
		
/*		String checked_by = rs.getString("checked_by");
		String checked_conclusion = rs.getString("checked_conclusion");
		String checked_time = rs.getString("checked_time");
		String user_id = rs.getString("user_id");
		String last_nsnj_date = rs.getString("last_nsnj_date");
		String approval_level = rs.getString("approval_level");
		String is_delete = rs.getString("is_delete");*/
	}

	private Connection getNewSQLServerConnection(Connection conn) {
		String url = "jdbc:microsoft:sqlserver://localhost:1433;DatabaseName=dbname";
		String classforname = "com.microsoft.jdbc.sqlserver.SQLServerDriver";
		String uid = "sa";
		String pwd = "password";
		ResourceBundle rb = ResourceBundle.getBundle("demo");
		
		if(rb.getString("sqlserver.datasource.drivername")!=null && !rb.getString("sqlserver.datasource.drivername").isEmpty()){
			classforname = rb.getString("sqlserver.datasource.drivername");
		}
		if(rb.getString("sqlserver.datasource.url")!=null && !rb.getString("sqlserver.datasource.url").isEmpty()){
			url = rb.getString("sqlserver.datasource.url");
		}
		if(rb.getString("sqlserver.datasource.usename")!=null && !rb.getString("sqlserver.datasource.usename").isEmpty()){
			uid = rb.getString("sqlserver.datasource.usename");
		}
		if(rb.getString("sqlserver.datasource.password")!=null && !rb.getString("sqlserver.datasource.password").isEmpty()){
			pwd = rb.getString("sqlserver.datasource.password");
		}
		try {
			Class.forName(classforname);
			if (conn == null || conn.isClosed())
				conn = DriverManager.getConnection(url, uid, pwd);
		} catch (ClassNotFoundException ex) {
			log.error("failed to get connection.e:"+ex.getMessage());
		} catch (SQLException ex) {
			log.error("failed to get connection.e:"+ex.getMessage());
		}

		return conn;
	}

}
