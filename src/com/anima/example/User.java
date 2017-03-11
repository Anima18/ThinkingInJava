package com.anima.example;

/**
 * Created by jianjianhong on 2017/3/8.
 */

public class User {
    public String name;
    private String avatar;
    private boolean isSelected;
    private Address address;
    

    public User(String name, String avatar, boolean isSelected, Address address) {
        this.name = name;
        this.avatar = avatar;
        this.isSelected = isSelected;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
    
}
