package Modules.utils;

import Modules.Design.Clases.Singleton;
import Modules.Design.Clases.InvitationCard;
import Modules.Design.Clases.LogoDesign;
import Modules.utils.find_functions;

public class find_functions {

	public static int find_logoDesign(LogoDesign logoDesign) {

		for (int i = 0; i < Singleton.LogoDesign.size(); i ++ ) {
			
			if ((Singleton.LogoDesign.get(i)).equals(logoDesign)) {

				return i;

			}

		}

		return -1;

	}


	public static int find_invitationCard(InvitationCard invitationCard) {

		for (int i = 0; i < Singleton.InvitationCard.size(); i ++ ) {
			
			if ((Singleton.InvitationCard.get(i)).equals(invitationCard)) {

				return i;

			}

		}

		return -1;

	}
}