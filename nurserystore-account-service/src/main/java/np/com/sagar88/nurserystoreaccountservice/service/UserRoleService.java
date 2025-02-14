package np.com.sagar88.nurserystoreaccountservice.service;

import np.com.sagar88.nurserystoreaccountservice.web.MapRoleToUsersRequest;
import np.com.sagar88.nurserystoreaccountservice.web.MapUserToRolesRequest;

/**
 * @author: Sagar Subedi, Date : 2024-08-27
 */
public interface UserRoleService {

  void mapUserToRoles(String userNameOrEmail, MapUserToRolesRequest mapUserToRolesRequest);

  void removeRolesFromUser(String userNameOrEmail, MapUserToRolesRequest mapUserToRolesRequest);

  void mapRoleToUsers(String roleName, MapRoleToUsersRequest mapRoleToUsersRequest);
}
