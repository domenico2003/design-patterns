package riccardogulin.u5d14.composite;

import java.util.ArrayList;
import java.util.List;

public class Parent implements Human {
	private String name;
	private List<Human> parents = new ArrayList<>();
	private List<Human> children = new ArrayList<>();

	public Parent(String name) {
		super();
		this.name = name;
	}

	@Override
	public void print() {
		System.out.println("*******************");
		System.out.println("Name: " + this.name);
		System.out.println("Parents: ");
		for (Human parent : parents) {
			System.out.println(" --> Name: " + parent.getName());
		}

		System.out.println("Children: ");
		for (Human child : children) {
			System.out.println(" --> Name: " + child.getName());
		}
		System.out.println("*******************");

	}

	@Override
	public void addChild(Human child) {
		children.add(child);

	}

	@Override
	public void addParent(Human parent) {
		parents.add(parent);

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
