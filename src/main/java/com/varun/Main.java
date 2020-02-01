package com.varun;

import java.nio.charset.StandardCharsets;
import java.sql.Connection;

import javax.sql.DataSource;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.jdbc.datasource.init.ScriptUtils;

import oracle.jdbc.driver.OracleDriver;

public class Main {

	public static void main(String[] args) {
		/*String str = "INSERT INTO QP_FTE.FTE_TEST_RULE_DEPT_MPNG VALUES(%s, 10, %s, 'N', SYSDATE, 'DFTE001', SYSDATE, 'DFTE001', 0);";
		for(int i=1;i<175;i++) {
			System.out.println(String.format(str, i+9,i));
		}*/
		DataSource dataSource = new SimpleDriverDataSource(new OracleDriver(), "jdbc:oracle:thin:@//172.16.82.19:1521/pstdb55.pstech.pstechnology.com","DFTE002","d0ne1n8" );
		Connection connection  = null;
		try {
			System.out.println("started");
			connection = dataSource.getConnection();
			ScriptUtils.executeSqlScript(connection, new EncodedResource(new ClassPathResource("qual-876.sql"),StandardCharsets.UTF_8));
			connection.close();
			System.out.println("closed...");
		} catch (Exception exception){
			exception.printStackTrace();
		} finally {
			
		}
		
	}
}
