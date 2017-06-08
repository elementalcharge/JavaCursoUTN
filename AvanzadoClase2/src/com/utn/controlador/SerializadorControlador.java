package com.utn.controlador;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.utn.modelo.Vehiculo;

public class SerializadorControlador {

	public void serializoObjeto(Vehiculo vehiculo) {
		try {
			FileOutputStream file= new FileOutputStream("Objeto.ser");
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(vehiculo);
			out.flush();
			out.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public Vehiculo deserializar() {
		 try {
			FileInputStream file= new FileInputStream("objeto.ser");
			ObjectInputStream in= new ObjectInputStream(file);
			return (Vehiculo)in.readObject();
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
		
	}
}
