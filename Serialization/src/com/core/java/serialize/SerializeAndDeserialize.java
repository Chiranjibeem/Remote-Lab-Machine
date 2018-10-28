package com.core.java.serialize;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeAndDeserialize<T> {

	T t;

	public SerializeAndDeserialize(T t) {
		this.t = t;
	}

	public boolean serialize() {

		try (FileOutputStream fos = new FileOutputStream(new File(System.getProperty("user.dir") + "/" + "Person.ser"));
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(t);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	@SuppressWarnings("unchecked")
	public T deserialize(String path) {

		try (FileInputStream fis = new FileInputStream(new File(path));
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			this.t = (T) ois.readObject();
			return t;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

}
