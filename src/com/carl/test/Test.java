package com.carl.test;

import com.carl.test.vo.User;

import java.math.BigInteger;
import java.util.*;

/**
 * Created by Carl on 15-1-7.
 */
public class Test {
    public static void main(String[] args) {
        String sql = " CREATE TEMPORARY TABLE "+"INF_CardUserInfo_tmp"+"( ORDERNO VARCHAR(32), REGIONALCODE VARCHAR(10), " +
                "NAME VARCHAR(30),SEX VARCHAR(2), NATION VARCHAR(2), NATIONALITY  VARCHAR(4), PHONE  VARCHAR(30), " +
                "CERTCODE  VARCHAR(18), CERTVALIDITY VARCHAR(30), DOMICILE  VARCHAR(100), BIRTHDAY VARCHAR(12), " +
                "PERSONALSTATUS  VARCHAR(4), HOUSEHOLDPROPERTIES VARCHAR(4), MOBLIE VARCHAR(18), ADDRSS VARCHAR(100), " +
                "POSTCODE VARCHAR(10), TRADECODE VARCHAR(20), TRADENAME VARCHAR(50), APPLYFORMCODE VARCHAR(20), " +
                "CARDTYPE  VARCHAR(4), CERTTYPE VARCHAR(2), EMAIL   VARCHAR(20), USERCODE  VARCHAR(20), " +
                "COLLECTIVECODE VARCHAR(20), COLLECTIVENAME VARCHAR(50), GUARDIANCERTTYPE  VARCHAR(2), " +
                "GUARDIANNAME  VARCHAR(50), GUARDIANIDCARD  VARCHAR(18), SERVICEBANK  VARCHAR(10), " +
                "APPLYNETCODE VARCHAR(20), BATCHNO  VARCHAR(50), ADDUSERCODE VARCHAR(20), " +
                "ADDDATE DATETIME, MODUSERCODE  VARCHAR(20), MODDATE  DATETIME, IMPORTSTATE VARCHAR(10), " +
                "IMPORTERROR VARCHAR(200),COMMUNITYCARDNO VARCHAR(17), SEQ_NUMBER VARCHAR(20), BANK_CARDNO VARCHAR(4)," +
                " SID  VARCHAR(36), ORGCODE VARCHAR(10), SYS_STATE BIGINT(22), SYS_ERRORCODE  VARCHAR(10)," +
                " SYS_ERRORDESC VARCHAR(100), SYS_ERRORSUGG VARCHAR(100), BUSSTATUS  VARCHAR(10), " +
                "PHYSICALCARDNO VARCHAR(50), OPERATIONTIME VARCHAR(20), BUSSINESSCODE VARCHAR(20), FILLINWHY VARCHAR(100))";
        StringBuffer sb = new StringBuffer();

        System.out.println(sql);
    }
}
