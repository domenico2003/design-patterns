package riccardogulin.u5d14.composite;

import java.util.ArrayList;
import java.util.List;

public class Child implements Human {
	private String name;
	private List<Human> parents = new ArrayList<>();

	public Child(String name) {
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

		System.out.println("*******************");
	}

	@Override
	public void addChild(Human child) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addParent(Human parent) {
		parents.add(parent);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public List<Human> getChildren() {
		// TODO Auto-generated method stub
		return new ArrayList<Human>();
	}

}
