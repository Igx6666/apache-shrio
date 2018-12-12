package com.shiro.entity;

import java.util.HashSet;
import java.util.Set;

public class Role {
    private Integer rid;

    private String rname;

    private Set<Permission> permissions = new HashSet<>();

    private Set<User> users = new HashSet<>();

    public Set<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(Set<Permission> permissions) {
        this.permissions = permissions;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public Set<Permission> getPermissionSet() {
        return permissions;
    }

    public void setPermissionSet(Set<Permission> permissionSet) {
        this.permissions = permissionSet;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }
}