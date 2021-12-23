/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundry.laundry.dto;

import java.util.List;
import lombok.Data;

/**
 *
 * @author HP
 */
@Data
public class Response {
    List<PickupRequest> pickup_dates;
}
