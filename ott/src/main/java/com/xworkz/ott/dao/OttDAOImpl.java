package com.xworkz.ott.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.ott.dto.OttDTO;

@Component
public class OttDAOImpl implements OttDAO {
	@Autowired
	private DataSource dataSource;

	@Override
	public boolean save(OttDTO dto) {
		String sql = "insert into ott values(?,?,?,?,?,?,?)";
		
		try (Connection connection = dataSource.getConnection()) {

			PreparedStatement prepare = connection.prepareStatement(sql);
			prepare.setString(1, dto.getName());
			prepare.setString(2, dto.getRegion());
			prepare.setString(3, dto.getSubscriptionPlan());
			prepare.setString(4, dto.getUser());
			prepare.setInt(5, dto.getSince());
			prepare.setString(6, dto.getLang());
			prepare.setBoolean(7, dto.isActive());
			int row = prepare.executeUpdate();
			System.out.println(row);
			return row > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
