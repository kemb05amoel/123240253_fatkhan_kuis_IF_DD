/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuispboftkhn;

/**
 *
 * @author Lab Informatika
 */
public class MahasiswaBeasiswa {
	public class MahasiswaBeasiswa extends Mahasiswa implements Aktivitas {
	private int data;

	Public void tampilkandata() {
		//tampilkan super nama
	}
	public void inputnilai(int[] nilai, int data) //lempar kelas
	exception {
 	for(int i = 0; i < data; i ++){
 	// isi kondisi throw
 	this.setNilai(nilai);

	}

	@Override 
	public void inputnilai(int nilai) throws InvalidInput{
		if (nilai = 0) {
			throw new InvalidInput("Inputnilai tidak valid : "+                                nilai); } else {
			System.err.println(" nilai awal : "+ getNilai());
			
		}
	
}
