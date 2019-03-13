package eu.ensup.aggregationtestssuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import eu.ensup.assertTest.AssertTest;

	// Permet de lancer les tests et d'utiliser SuiteClasses
@RunWith(Suite.class)
@SuiteClasses({
	// on indique les class tests à lancer
	AssertTest.class
})
public class AggregationTestsSuitTest {
	// Cette classe reste vide, elle est utilisée pour les annotations au dessus
}
