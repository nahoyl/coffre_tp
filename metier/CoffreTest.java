package metier;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class CoffreTest {
	
	private I_CoffreChateau coffre;

	@Before
	public void setUp() throws Exception {
		coffre = new Coffre();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAuDemarrage() {
		assertEquals("CacheParBibliotheque",coffre.nomEtat());
		assertFalse(coffre.chienEstLibere());
		assertFalse(coffre.lapinEstLibere());
	}

	@Test
	public void testApresAvoirOteLeLivreDeLaBibliotheque() {
		coffre.oterLivre();
		assertEquals("Ferme",coffre.nomEtat());
		assertFalse(coffre.chienEstLibere());
		assertFalse(coffre.lapinEstLibere());
	}
	
	@Test
	public void testApresAvoirRemisLeLivreDansLaBibliothequeSansAvoirTouchePrealablementALaChandelle() {
		coffre.oterLivre();
		coffre.remettreLivre();
		assertEquals("CacheParBibliotheque",coffre.nomEtat());
		assertFalse(coffre.chienEstLibere());
		assertFalse(coffre.lapinEstLibere());
	}
	
	@Test
	public void testFermer(){
		coffre.oterLivre();
		assertEquals("Ferme",coffre.nomEtat());
		assertFalse(coffre.chienEstLibere());
		assertFalse(coffre.lapinEstLibere());
	}
	
	@Test
	public void testPresqueOuvert(){
		coffre.oterLivre();
		coffre.tournerChandelleVersDroite();
		assertEquals("PresqueOuvert",coffre.nomEtat());
		assertTrue(coffre.chienEstLibere());
		assertFalse(coffre.lapinEstLibere());
	}
	
	@Test
	public void testBloque(){
		coffre.oterLivre();
		coffre.tournerChandelleVersGauche();
		assertEquals("Bloque",coffre.nomEtat());
		assertTrue(coffre.lapinEstLibere());
	}
	
	@Test
	public void testOuvert(){
		coffre.oterLivre();
		coffre.tournerChandelleVersDroite();
		coffre.tournerChandelleVersDroite();
		assertEquals("Ouvert",coffre.nomEtat());
		assertFalse(coffre.lapinEstLibere());
		assertTrue(coffre.chienEstLibere());
	}
	
	@Test
	public void testOuvertPuisFermer(){
		coffre.oterLivre();
		coffre.tournerChandelleVersDroite();
		coffre.tournerChandelleVersDroite();
		coffre.fermerCoffre();
		assertEquals("Ferme",coffre.nomEtat());
		assertFalse(coffre.lapinEstLibere());
		assertTrue(coffre.chienEstLibere());
	}
	
	@Test
	public void testOuvertPuisFermerPuisCache(){
		coffre.oterLivre();
		coffre.tournerChandelleVersDroite();
		coffre.tournerChandelleVersDroite();
		coffre.fermerCoffre();
		coffre.remettreLivre();
		assertEquals("CacheParBibliotheque",coffre.nomEtat());
		assertFalse(coffre.lapinEstLibere());
		assertFalse(coffre.chienEstLibere());

	}
	
	@Test
	public void testPresqueOuvertPuisBloque(){
		coffre.oterLivre();
		coffre.tournerChandelleVersDroite();
		coffre.tournerChandelleVersGauche();
		assertEquals("Bloque",coffre.nomEtat());
		assertTrue(coffre.chienEstLibere());
		assertTrue(coffre.lapinEstLibere());
	}
	
	public void testPresqueOuvertPuisBloquePuisToujoursBloque(){
		coffre.oterLivre();
		coffre.tournerChandelleVersDroite();
		coffre.tournerChandelleVersGauche();
		coffre.tournerChandelleVersDroite();
		coffre.fermerCoffre();
		coffre.remettreLivre();
		coffre.oterLivre();
		assertEquals("Bloque",coffre.nomEtat());
		assertTrue(coffre.chienEstLibere());
		assertFalse(coffre.lapinEstLibere());
	}
	
	public void testCacheBloque(){
		coffre.tournerChandelleVersGauche();
		assertEquals("CacheParBibliotheque",coffre.nomEtat());
		assertFalse(coffre.chienEstLibere());
		assertFalse(coffre.lapinEstLibere());
	}

}
