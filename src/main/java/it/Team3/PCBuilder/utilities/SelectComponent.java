package it.Team3.PCBuilder.utilities;

import java.util.ArrayList;

public interface SelectComponent<test extends Component> {
     test componentSelector(ArrayList<test> parts, String partName);
}
