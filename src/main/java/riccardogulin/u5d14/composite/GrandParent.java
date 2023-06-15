package riccardogulin.u5d14.composite;

import java.util.ArrayList;
import java.util.List;

public class GrandParent implements Human {
	private String name;
	private List<Human> children = new ArrayList<>();

	public GrandParent(String name) {
		super();
		this.name = name;
	}

	@Override
	public void print() {
		System.out.println("*******************");
		System.out.println("Name: " + this.name);
		System.out.println("Children: ");
		for (Human child : children) {
			System.out.println(" --> Name: " + child.getName());
			System.out.println("Nephews: ");
			for (Human nephew : child.getChildren()) {
				System.out.println(" --> Name: " + nephew.getName());
			}
		}

		System.out.println("*******************");

	}

	@Override
	public void addChild(Human child) {
		children.add(child);

	}

	@Override
	public void addParent(Human parent) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public List<Human> getChildren() {
		// TODO Auto-generated method stub
		return children;
	}

}
