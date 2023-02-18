package dio.myfirstwebapi.repository;

import dio.myfirstwebapi.user.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public void save(User user){
        if(user.getId()==null){
            System.out.println("SAVE - Recebendo usuario na camada de repositório");
        } else {
            System.out.println("UPDATE - Recebendo usuario na camada de repositório");
        }
        System.out.println(user);
    }

}
