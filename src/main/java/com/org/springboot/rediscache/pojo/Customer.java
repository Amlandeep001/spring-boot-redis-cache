package com.org.springboot.rediscache.pojo;

import java.io.Serializable;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Customer implements Serializable
{
	private static final long serialVersionUID = -7995072393607203898L;

	String name;
	String email;
	String id;
}
