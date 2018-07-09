package cn.tedu.exer;

public class T0703 {

}

class Role {

	private String name;

	public Role(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int attack() {
		return 0;
	}

}

class Magicer extends Role {

	private int level;

	public Magicer(String name) {
		super(name);
		this.level = 1;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		if (level >= 1 && level <= 10)
			this.level = level;
	}

	@Override
	public int attack() {
		return level * 5;
	}

}

class Soldier extends Role {

	private int hurt;

	public Soldier(String name) {
		super(name);
	}

	public int getHurt() {
		return hurt;
	}

	public void setHurt(int hurt) {
		if (hurt > 0)
			this.hurt = hurt;
	}

	@Override
	public int attack() {
		return hurt;
	}

}

class Team {

	private Role[] rs = new Role[6];
	private int count = 0;

	public void addMember(Role r) {

		if (count < 6)
			rs[count++] = r;

	}
	
	public int attackSum(){
		int sum = 0;
		for (int i = 0; i < count; i++) {
			sum += rs[i].attack();
		}
		return sum;
	}

}