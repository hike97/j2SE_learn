package com.atguigu.java_reflection;


@MyAnnotation ("类注解")
public class Person extends Creature<String> implements Comparable,MyInterface{
	public String name;
	private int age;
	int id;
	public Person() {
		super();
		System.out.println ("hello people");
	}
	public Person(String name) {
		super();
		this.name = name;
	}
	private Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public int getId () {
		return id;
	}

	public void setId (int id) {
		this.id = id;
	}

	@MyAnnotation ("show方法注解")
	public void show(){

		System.out.println("我是一个人");
	}
	
	private Integer display(String nation,Integer i) throws Exception {
		System.out.println("我的国籍是：" + nation);
		return i;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
	public static void info(){
		System.out.println ("chinese!");
	}
	@Override
	public int compareTo (Object o) {
		return 0;
	}
	class Bird{

	}
}
