/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuispboftkhn;

/**
 *
 * @author Lab Informatika
 */
public class InvalidInput extends Exception {
		public InvalidInput(){
			super();
		}

		public InvalidInput(String massage){
			super(massage);
		}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
	}
		public InvalidInput(Throwable cause){
			super(cause);
		}
}
