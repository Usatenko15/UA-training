package com.company;

public final class Student {
    private final String name;
    private final int age;
    private final String group;
    private final ColorEyes colorEyes;

    public Student(String name, int age, String group, ColorEyes colorEyes) {
        this.name = name;
        this.age = age;
        this.group = group;
        ColorEyes clone = new ColorEyes();
        clone.setColorEyes(colorEyes.getColorEyes());
        this.colorEyes = clone;
    }

    public ColorEyes getColorEyes() {
        ColorEyes clone = new ColorEyes();
        clone.setColorEyes(this.colorEyes.getColorEyes());
        return clone;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGroup() {
        return group;
    }

    public Student setName(String name) {
        return new Student(name,this.age, this.group,this.colorEyes);

    }

    public Student setAge(int age) {
        return new Student(this.name, age, this.group, this.colorEyes);

    }

    public Student setGroup(String group) {
        return new Student(this.name,this.age, group, this.colorEyes);

    }

    public Student serColorEyes(ColorEyes colorEyes){
        return new Student(this.name,this.age, this.group, colorEyes);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        return (name.hashCode()*prime + age)*prime + group.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj ==  null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student student = (Student) obj;
        if (!name.equals((student.name)))
            return false;
        if (!group.equals(student.group))
            return false;
        if (age!=student.age)
            return false;
        return true;
    }


}
