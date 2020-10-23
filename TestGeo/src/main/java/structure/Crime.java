package structure;

public class Crime {
	private String CMPLNT_NUM;
	private String ADDR_PCT_CD;
	private String BORO_NM;
	private String CMPLNT_FR_DT;
	private String CMPLNT_FR_TM;
	private String CMPLNT_TO_DT;
	private String CMPLNT_TO_TM;
	private String CRM_ATPT_CPTD_CD;
	private String HADEVELOPT;
	private String HOUSING_PSA;
	private String JURISDICTION_CODE;
	private String JURIS_DESC;
	private String KY_CD;
	private String LAW_CAT_CD;
	private String LOC_OF_OCCUR_DESC;
	private String OFNS_DESC;
	private String PARKS_NM;
	private String PATROL_BORO;
	private String PD_CD;
	private String PD_DESC;
	private String PREM_TYP_DESC;
	private String RPT_DT;
	private String STATION_NAME;
	private String SUSP_AGE_GROUP;
	private String SUSP_RACE;
	private String SUSP_SEX;
	private String TRANSIT_DISTRICT;
	private String VIC_AGE_GROUP;
	private String  VIC_RACE;
	private String  VIC_SEX;
	private String  X_COORD_CD;
	private String  Y_COORD_CD;
	private float  Latitude;
	private float  Longitude;
	private String  Lat_Lon;
	
	public Crime() {
		super();
	}

	public String getCMPLNT_NUM() {
		return CMPLNT_NUM;
	}

	public void setCMPLNT_NUM(String cMPLNT_NUM) {
		CMPLNT_NUM = cMPLNT_NUM;
	}

	public String getADDR_PCT_CD() {
		return ADDR_PCT_CD;
	}

	public void setADDR_PCT_CD(String aDDR_PCT_CD) {
		ADDR_PCT_CD = aDDR_PCT_CD;
	}

	public String getBORO_NM() {
		return BORO_NM;
	}

	public void setBORO_NM(String bORO_NM) {
		BORO_NM = bORO_NM;
	}

	public String getCMPLNT_FR_DT() {
		return CMPLNT_FR_DT;
	}

	public void setCMPLNT_FR_DT(String cMPLNT_FR_DT) {
		CMPLNT_FR_DT = cMPLNT_FR_DT;
	}

	public String getCMPLNT_FR_TM() {
		return CMPLNT_FR_TM;
	}

	public void setCMPLNT_FR_TM(String cMPLNT_FR_TM) {
		CMPLNT_FR_TM = cMPLNT_FR_TM;
	}

	public String getCMPLNT_TO_DT() {
		return CMPLNT_TO_DT;
	}

	public void setCMPLNT_TO_DT(String cMPLNT_TO_DT) {
		CMPLNT_TO_DT = cMPLNT_TO_DT;
	}

	public String getCMPLNT_TO_TM() {
		return CMPLNT_TO_TM;
	}

	public void setCMPLNT_TO_TM(String cMPLNT_TO_TM) {
		CMPLNT_TO_TM = cMPLNT_TO_TM;
	}

	public String getCRM_ATPT_CPTD_CD() {
		return CRM_ATPT_CPTD_CD;
	}

	public void setCRM_ATPT_CPTD_CD(String cRM_ATPT_CPTD_CD) {
		CRM_ATPT_CPTD_CD = cRM_ATPT_CPTD_CD;
	}

	public String getHADEVELOPT() {
		return HADEVELOPT;
	}

	public void setHADEVELOPT(String hADEVELOPT) {
		HADEVELOPT = hADEVELOPT;
	}

	public String getHOUSING_PSA() {
		return HOUSING_PSA;
	}

	public void setHOUSING_PSA(String hOUSING_PSA) {
		HOUSING_PSA = hOUSING_PSA;
	}

	public String getJURISDICTION_CODE() {
		return JURISDICTION_CODE;
	}

	public void setJURISDICTION_CODE(String jURISDICTION_CODE) {
		JURISDICTION_CODE = jURISDICTION_CODE;
	}

	public String getJURIS_DESC() {
		return JURIS_DESC;
	}

	public void setJURIS_DESC(String jURIS_DESC) {
		JURIS_DESC = jURIS_DESC;
	}

	public String getKY_CD() {
		return KY_CD;
	}

	public void setKY_CD(String kY_CD) {
		KY_CD = kY_CD;
	}

	public String getLAW_CAT_CD() {
		return LAW_CAT_CD;
	}

	public void setLAW_CAT_CD(String lAW_CAT_CD) {
		LAW_CAT_CD = lAW_CAT_CD;
	}

	public String getLOC_OF_OCCUR_DESC() {
		return LOC_OF_OCCUR_DESC;
	}

	public void setLOC_OF_OCCUR_DESC(String lOC_OF_OCCUR_DESC) {
		LOC_OF_OCCUR_DESC = lOC_OF_OCCUR_DESC;
	}

	public String getOFNS_DESC() {
		return OFNS_DESC;
	}

	public void setOFNS_DESC(String oFNS_DESC) {
		OFNS_DESC = oFNS_DESC;
	}

	public String getPARKS_NM() {
		return PARKS_NM;
	}

	public void setPARKS_NM(String pARKS_NM) {
		PARKS_NM = pARKS_NM;
	}

	public String getPATROL_BORO() {
		return PATROL_BORO;
	}

	public void setPATROL_BORO(String pATROL_BORO) {
		PATROL_BORO = pATROL_BORO;
	}

	public String getPD_DESC() {
		return PD_DESC;
	}

	public void setPD_DESC(String pD_DESC) {
		PD_DESC = pD_DESC;
	}

	public String getPREM_TYP_DESC() {
		return PREM_TYP_DESC;
	}

	public void setPREM_TYP_DESC(String pREM_TYP_DESC) {
		PREM_TYP_DESC = pREM_TYP_DESC;
	}

	public String getRPT_DT() {
		return RPT_DT;
	}

	public void setRPT_DT(String rPT_DT) {
		RPT_DT = rPT_DT;
	}

	public String getSTATION_NAME() {
		return STATION_NAME;
	}

	public void setSTATION_NAME(String sTATION_NAME) {
		STATION_NAME = sTATION_NAME;
	}

	public String getSUSP_AGE_GROUP() {
		return SUSP_AGE_GROUP;
	}

	public void setSUSP_AGE_GROUP(String sUSP_AGE_GROUP) {
		SUSP_AGE_GROUP = sUSP_AGE_GROUP;
	}

	public String getSUSP_RACE() {
		return SUSP_RACE;
	}

	public void setSUSP_RACE(String sUSP_RACE) {
		SUSP_RACE = sUSP_RACE;
	}

	public String getSUSP_SEX() {
		return SUSP_SEX;
	}

	public void setSUSP_SEX(String sUSP_SEX) {
		SUSP_SEX = sUSP_SEX;
	}

	public String getTRANSIT_DISTRICT() {
		return TRANSIT_DISTRICT;
	}

	public void setTRANSIT_DISTRICT(String tRANSIT_DISTRICT) {
		TRANSIT_DISTRICT = tRANSIT_DISTRICT;
	}

	public String getVIC_AGE_GROUP() {
		return VIC_AGE_GROUP;
	}

	public void setVIC_AGE_GROUP(String vIC_AGE_GROUP) {
		VIC_AGE_GROUP = vIC_AGE_GROUP;
	}

	public String getVIC_RACE() {
		return VIC_RACE;
	}

	public void setVIC_RACE(String vIC_RACE) {
		VIC_RACE = vIC_RACE;
	}

	public String getVIC_SEX() {
		return VIC_SEX;
	}

	public void setVIC_SEX(String vIC_SEX) {
		VIC_SEX = vIC_SEX;
	}

	public String getX_COORD_CD() {
		return X_COORD_CD;
	}

	public void setX_COORD_CD(String x_COORD_CD) {
		X_COORD_CD = x_COORD_CD;
	}

	public String getY_COORD_CD() {
		return Y_COORD_CD;
	}

	public void setY_COORD_CD(String y_COORD_CD) {
		Y_COORD_CD = y_COORD_CD;
	}

	public float getLatitude() {
		return Latitude;
	}

	public void setLatitude(float latitude) {
		Latitude = latitude;
	}

	public float getLongitude() {
		return Longitude;
	}

	public void setLongitude(float longitude) {
		Longitude = longitude;
	}

	public String getLat_Lon() {
		return Lat_Lon;
	}

	public void setLat_Lon(String lat_Lon) {
		Lat_Lon = lat_Lon;
	}

	public String getPD_CD() {
		return PD_CD;
	}

	public void setPD_CD(String pD_CD) {
		PD_CD = pD_CD;
	}

	@Override
	public String toString() {
		return "Crime [CMPLNT_NUM=" + CMPLNT_NUM + ", ADDR_PCT_CD=" + ADDR_PCT_CD + ", BORO_NM=" + BORO_NM
				+ ", CMPLNT_FR_DT=" + CMPLNT_FR_DT + ", CMPLNT_FR_TM=" + CMPLNT_FR_TM + ", CMPLNT_TO_DT=" + CMPLNT_TO_DT
				+ ", CMPLNT_TO_TM=" + CMPLNT_TO_TM + ", CRM_ATPT_CPTD_CD=" + CRM_ATPT_CPTD_CD + ", HADEVELOPT="
				+ HADEVELOPT + ", HOUSING_PSA=" + HOUSING_PSA + ", JURISDICTION_CODE=" + JURISDICTION_CODE
				+ ", JURIS_DESC=" + JURIS_DESC + ", KY_CD=" + KY_CD + ", LAW_CAT_CD=" + LAW_CAT_CD
				+ ", LOC_OF_OCCUR_DESC=" + LOC_OF_OCCUR_DESC + ", OFNS_DESC=" + OFNS_DESC + ", PARKS_NM=" + PARKS_NM
				+ ", PATROL_BORO=" + PATROL_BORO + ", PD_CD=" + PD_CD + ", PD_DESC=" + PD_DESC + ", PREM_TYP_DESC="
				+ PREM_TYP_DESC + ", RPT_DT=" + RPT_DT + ", STATION_NAME=" + STATION_NAME + ", SUSP_AGE_GROUP="
				+ SUSP_AGE_GROUP + ", SUSP_RACE=" + SUSP_RACE + ", SUSP_SEX=" + SUSP_SEX + ", TRANSIT_DISTRICT="
				+ TRANSIT_DISTRICT + ", VIC_AGE_GROUP=" + VIC_AGE_GROUP + ", VIC_RACE=" + VIC_RACE + ", VIC_SEX="
				+ VIC_SEX + ", X_COORD_CD=" + X_COORD_CD + ", Y_COORD_CD=" + Y_COORD_CD + ", Latitude=" + Latitude
				+ ", Longitude=" + Longitude + ", Lat_Lon=" + Lat_Lon + "]";
	}

	
	
	
	
}
