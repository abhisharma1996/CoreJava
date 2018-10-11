package com.cg.banking.daoservices;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.banking.beans.Account;
import com.cg.banking.util.ConnectionProvider;

public class AccountDAOServicesImpl implements AccountDAO {
	ArrayList<Account> accounts=new ArrayList<Account>();
	 private Connection conn=ConnectionProvider.getDBConnection();
	@Override
	public Account save(Account account)throws SQLException {
		
			/*accounts.add(account);*/
		try {
			conn.setAutoCommit(false);
			PreparedStatement ps1=conn.prepareStatement("Insert into Account(accountNo,accountBalance,pinNumber,"
					+ "accountType,status) values(?,?,?,?,?)");
			ps1.setLong(1, account.getAccountNo());
			ps1.setFloat(2, account.getAccountBalance());
			ps1.setInt(3, account.getPinNumber());
			ps1.setString(4, account.getAccountType());
			ps1.setString(5, account.getStatus());
			ps1.executeUpdate();
			conn.commit();
			return account;
			
			} catch (SQLException e) {
			   conn.rollback();
			   throw e;
		}
			finally{
				conn.setAutoCommit(true);
			}
		
	}		
@Override
	public Account findOne(long accountNo) {
		try {
			PreparedStatement ps2=conn.prepareStatement("select * from Account where accountNo="+accountNo);
			ResultSet accountRs=ps2.executeQuery();
			while(accountRs.next()){
		//	long accountno=	accountRs.getLong("accountNo");
			float accountBalance=accountRs.getFloat("accountBalance");
			int pinNumber=accountRs.getInt("pinNumber");
			String accountType=accountRs.getString("accountType");
			String Status=accountRs.getString("Status");
			Account acc=new Account(pinNumber, accountType, Status, accountBalance, accountNo);
			return acc;
			}
			
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		/*for (Account account : accounts) {
			if(account.getAccountNo()==accountNo)
				return account;*/
		
		return null;
	}

	@Override
	public ArrayList<Account> findAll() {
	/*	return accounts;*/
		return null;
	}
	
	

}
