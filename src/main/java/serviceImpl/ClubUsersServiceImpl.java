package serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import dao.ClubUsersDao;
import model.ClubUsers;
import service.ClubUsersService;

public class ClubUsersServiceImpl implements ClubUsersService {
	
	@Autowired
	ClubUsersDao clubUserDao;

	@Override
	public List<ClubUsers> getClubUserByNum(String userId) {
		return clubUserDao.getClubUserByNum(userId);
	}
	
	@Override
	public int insertClub(ClubUsers clubUser) {
		return clubUserDao.insertClub(clubUser);
	}
	
	@Override
	public ClubUsers checkSignedById(String clubId) {
		return clubUserDao.checkSignedById(clubId);
	}
	
	@Override
	public ClubUsers checkMajorSigned() {
		return clubUserDao.checkMajorSigned();
	}

}
