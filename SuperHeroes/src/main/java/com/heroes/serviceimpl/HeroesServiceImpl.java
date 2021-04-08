package com.heroes.serviceimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import com.heroes.entity.HeroesEntity;
import com.heroes.service.HeroesService;

@Service("heroesService")
public class HeroesServiceImpl implements HeroesService{

	@Autowired
	private NamedParameterJdbcTemplate templeteHeroes;
	
	private static final String getHerosInfoQuery = "SELECT * FROM actors";
	
	
	public List<HeroesEntity> getHeroesInfo() {
		try {
		List<HeroesEntity> herosEntity = templeteHeroes.query(getHerosInfoQuery, new GetHeroesInfo());
		if(herosEntity != null) {
			System.out.println("Data Getting Successfully");
		}else {
			System.out.println("Data Getting Faild");
		}
		return herosEntity;
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	private static final class GetHeroesInfo implements RowMapper<HeroesEntity>{

		@Override
		public HeroesEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
			HeroesEntity heroesEntity = new HeroesEntity();
			heroesEntity.setFullName(rs.getString("full_name"));
			heroesEntity.setYearOfEntry(rs.getString("year_of_entry"));
			heroesEntity.setFileIndustry(rs.getNString("film_industry"));
			heroesEntity.setDob(rs.getString("dob"));
			heroesEntity.setBirthPlace(rs.getString("birth_place"));
			heroesEntity.setCountry(rs.getString("country"));
			heroesEntity.setFollowers(rs.getString("followers"));
			heroesEntity.setRating(rs.getInt("Rating"));
			heroesEntity.setImage(rs.getString("image"));
			return heroesEntity;
		}
	}

	@Override
	public List<HeroesEntity> getHeroesNames() {
		// TODO Auto-generated method stub
		return null;
	}

}
