package np.com.sagar88.nurserystorebillingservice.web;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

/**
 * @author Sagar Subedi, Date : 06-Dec-2020
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateAddressRequest {

    @NotBlank
    private String addressId;

    @NonNull
    private String addressLine1;
    private String addressLine2;

    @NonNull
    private String city;

    @NonNull
    private String state;

    @NonNull
    private String postalCode;

    @Pattern(regexp = "[A-Z]{2}", message = "2-letter ISO country code required")
    @NonNull
    private String country;

    @NonNull
    private String phone;

}
