package tacos.data;


import lombok.Data;

import java.util.List;

/**
 * @author valit
 * date     22.04.2022
 * @project taco-cloud
 */
@Data
public class Taco {

    private String name;

    private List<Ingredient> ingredients;

}
