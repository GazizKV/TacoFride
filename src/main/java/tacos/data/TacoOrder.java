package tacos.data;


import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author valit
 * date     22.04.2022
 * @project taco-cloud
 */
@Data
public class TacoOrder {

    private String deliveryName;
    private String deliveryStreet;
    private String deliveryCity;
    private String deliveryState;
    private String deliveryZip;
    private String ccNumber;
    private String ccExpiration;
    private String ccCVV;

    private List<Taco> tacos = new ArrayList<>();

    public void AddTaco(Taco taco) {
        this.tacos.add(taco);
    }

}
