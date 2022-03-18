# TCC *vs* LCC

Explain under which circumstances *Tight Class Cohesion* (TCC) and *Loose Class Cohesion* (LCC) metrics produce the same value for a given Java class. Build an example of such as class and include the code below or find one example in an open-source project from Github and include the link to the class below. Could LCC be lower than TCC for any given class? Explain.

## Answer


Pour que TCC et LCC aient la même valeur, il ne faut pas de lien indirect entre les paires de méthodes.
LCC ne peut pas être plus bas que TCC car TCC prend en compte les liens indirects (il sera donc superieur ou égal)
