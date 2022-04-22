package tacos.data;


import lombok.Data;

/**
 * @author valit
 * date     22.04.2022
 * @project taco-cloud
 */
@Data
public class Ingredient {

    private final String id;
    private final String name;
    private final Type type;

    public enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }

}
