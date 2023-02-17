package Utils;

import Modules.Design.Clases.Singleton; 
import Modules.Design.Clases.LogoDesign;

public class find_functions {

	public static int find_logoDesign(LogoDesign logoDesign) {

		for (int i = 0; i < Singleton.LogoDesign.size(); i ++ ) {
			
			if ((Singleton.LogoDesign.get(i)).equals(logoDesign)) {

				return i;

			}

		}

		return -1;

	}
}