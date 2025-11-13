# Java 3A - Projets de Travaux Pratiques

Ce dépôt contient les travaux pratiques (Prosits) réalisés dans le cadre du cours de Java niveau 3A.

## 📁 Structure du Projet

Le projet est organisé en plusieurs modules (Prosits), chacun abordant des concepts spécifiques de la programmation Java :

```
java-3A/
├── Prosit1/          # Gestion de Zoo avec gestion d'exceptions
└── prosit8/          # Gestion d'employés avec collections et tri
```

## 🦁 Prosit 1 : Système de Gestion de Zoo

### Description
Un système de gestion de zoo permettant d'ajouter des animaux avec gestion des exceptions personnalisées.

### Fonctionnalités
- ✅ Gestion d'animaux avec propriétés (famille, nom, âge, mammifère)
- ✅ Gestion d'exceptions personnalisées :
  - `InvalidAgeException` : pour les âges invalides (négatifs)
  - `ZooFullException` : lorsque le zoo atteint sa capacité maximale (3 animaux)
- ✅ Hiérarchie d'animaux (Animal, Aquatic, Terrestrial, Dolphin, Penguin)

### Structure des Packages
```
zoo/
├── entities/
│   ├── Animal.java
│   ├── Aquatic.java
│   ├── Terrestrial.java
│   ├── Dolphin.java
│   ├── Penguin.java
│   ├── Zoo.java
│   ├── InvalidAgeException.java
│   └── ZooFullException.java
└── management/
    └── ZooManagement.java
```

### Exécution
```bash
cd Prosit1/src
javac zoo/management/ZooManagement.java
java zoo.management.ZooManagement
```

### Exemple d'Utilisation
```java
Zoo zoo = new Zoo("Belvédère", "Tunis");
Animal lion = new Animal("Félin", "Lion", 5, true);

try {
    zoo.addAnimal(lion);
    System.out.println("Animal ajouté avec succès");
} catch (ZooFullException | InvalidAgeException e) {
    System.out.println("Erreur : " + e.getMessage());
}
```

## 👔 Prosit 8 : Système de Gestion d'Employés

### Description
Un système de gestion d'employés utilisant les collections Java (ArrayList) avec fonctionnalités de tri et recherche avancée.

### Fonctionnalités
- ✅ Gestion d'employés avec ArrayList
- ✅ Implémentation d'interfaces génériques :
  - `IGestion<T>` : opérations CRUD de base
  - `IRechercheAvancee<T>` : recherches et tris avancés
- ✅ Tri par :
  - ID (tri naturel avec Comparable)
  - Département, grade et nom (tri avec Comparator)
- ✅ Recherche par nom ou département

### Structure
```
prosit8/src/
├── Employe.java                # Classe Employe avec Comparable
├── IGestion.java               # Interface générique pour gestion
├── IRechercheAvancee.java      # Interface pour recherches avancées
├── SocieteArrayList.java       # Implémentation avec ArrayList
└── Main.java                   # Programme principal
```

### Exécution
```bash
cd prosit8/src
javac *.java
java Main
```

### Exemple d'Utilisation
```java
SocieteArrayList societe = new SocieteArrayList();
Employe emp = new Employe(1, "Ali", "Ben Salah", "IT", 3);

societe.ajouterEmploye(emp);
societe.displayEmploye();

// Tri par ID
societe.trierEmployeParId();

// Tri par département, grade et nom
societe.trierEmployeParNomDépartementEtGrade();

// Recherche par département
List<Employe> itEmployees = societe.rechercherParDepartement("IT");
```

## 🔧 Prérequis

- **Java JDK** : Version 8 ou supérieure
- **IDE recommandé** : IntelliJ IDEA (fichiers .iml présents)

## 📚 Concepts Java Abordés

### Prosit 1
- Programmation Orientée Objet (POO)
- Héritage et polymorphisme
- Gestion des exceptions personnalisées
- Try-catch avec multi-catch

### Prosit 8
- Collections Java (ArrayList)
- Interfaces génériques
- Interface Comparable (tri naturel)
- Interface Comparator (tri personnalisé)
- Méthodes de recherche et filtrage

## 🚀 Compilation et Exécution Globale

### Compiler tous les projets
```bash
# Prosit 1
cd Prosit1/src
javac zoo/**/*.java

# Prosit 8
cd ../../prosit8/src
javac *.java
```

### Exécuter les programmes
```bash
# Prosit 1
cd Prosit1/src
java zoo.management.ZooManagement

# Prosit 8
cd ../../prosit8/src
java Main
```

## 📝 Notes

- Les commentaires dans le code sont en français
- Chaque Prosit est un projet IntelliJ IDEA indépendant
- Les exceptions sont utilisées pour la validation des données
- Les collections ArrayList offrent une gestion dynamique des données

## 👨‍💻 Auteur

Projet réalisé dans le cadre du cours Java 3A.

---

*Dernière mise à jour : 2025*
