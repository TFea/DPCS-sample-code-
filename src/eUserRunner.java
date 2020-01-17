import com.sun.tools.javac.util.List;

public class eUserRunner {
	
	
public static void main(String [] agrs) { 	
	
	
	List<User> usersList = new ArrayList<User>();
	while (resultSet.next()) {
	            User user  = new User();
	            user.setId(resultSet.getInt("id"));
	            user.setName(resultSet.getString("name"));
	            user.setEmail(resultSet.getString("email"));
	            user.setMobile(resultSet.getString("mobile"));
	            user.setPassword(resultSet.getString("password"));
	            user.setRole(resultSet.getString("role"));
	            user.setStatus(resultSet.getString("status"));
	            user.setLast_udpate(resultSet.getString("last_update"));

	            // print the results
	            System.out.println(user);
	            usersList.add(user);
	        }

}   

}
