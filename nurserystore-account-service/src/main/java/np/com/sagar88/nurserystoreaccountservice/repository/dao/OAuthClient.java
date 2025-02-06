package np.com.sagar88.nurserystoreaccountservice.repository.dao;

//import np.com.sagar88.nurserystorecommons.util.DateAudit;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import np.com.sagar88.nurserystoreaccountservice.commons.DateAudit;
import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author: Sagar Subedi, Date : 2023-05-18
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "oauth_client_details")
@Builder
public class OAuthClient extends DateAudit {

  @Id
  @GeneratedValue(generator = "uuid")
  @GenericGenerator(name = "uuid", strategy = "uuid2")
  @Column(name = "CLIENT_ID", updatable = false, nullable = false)
  private String client_id;

  @Column(name = "CLIENT_SECRET", updatable = false, nullable = false)
  private String client_secret;
  private String authorized_grant_types;
  private String authorities;
  private String scope;
  private String resource_ids;

}
