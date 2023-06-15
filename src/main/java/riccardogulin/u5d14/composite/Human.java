package riccardogulin.u5d14.composite;

import java.util.List;

public interface Human {
	public void print();

	public void addChild(Human child);

	public void addParent(Human parent);

	public String getName();

	public List<Human> getChildren();

}
