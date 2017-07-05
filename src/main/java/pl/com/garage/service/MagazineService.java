package pl.com.garage.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.com.garage.dao.MagazienDao;

@Service
public class MagazineService {

    @Autowired
    private MagazienDao magazienDao;
}
