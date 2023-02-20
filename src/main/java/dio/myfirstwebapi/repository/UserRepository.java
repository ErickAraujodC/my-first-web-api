package dio.myfirstwebapi.repository;

import dio.myfirstwebapi.user.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

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

    public void deleteById(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }

    public List<User> findAll (){
        System.out.println("LIST - Listando os usuários do sistema");
        List<User> users = new ArrayList<>();
        users.add(new User("Erick", "Erick123"));
        users.add(new User("Gislaine", "Gislaine123"));
        return users;
    }

    public User findById(Integer id){
        System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um usuário", id));
        return new User("Erick", "Erick123");
    }

    public User findByUserName(String username){
        System.out.println(String.format("FIND/userName - Recebendo o userName: %s para localizar um usuário", username));
        return new User("Erick", "Erick123");
    }
}
