# Java 3A - Projets Java

Ce dépôt contient deux projets Java développés dans le cadre du cours de Java de 3ème année.

## 📋 Table des Matières

- [Aperçu](#aperçu)
- [Projets](#projets)
  - [Prosit1 - Système de Gestion de Zoo](#prosit1---système-de-gestion-de-zoo)
  - [Prosit8 - Système de Gestion d'Employés](#prosit8---système-de-gestion-demployés)
- [Prérequis](#prérequis)
- [Installation](#installation)
- [Utilisation](#utilisation)
- [Structure du Projet](#structure-du-projet)

## 🎯 Aperçu

Ce dépôt regroupe des exercices pratiques (Prosits) en Java couvrant différents concepts de programmation orientée objet :
- Gestion des exceptions personnalisées
- Interfaces et implémentations
- Collections Java (ArrayList)
- Comparaisons et tri d'objets
- Héritage et polymorphisme

## 📦 Projets

### Prosit1 - Système de Gestion de Zoo

Un système de gestion de zoo permettant d'ajouter des animaux avec validation et gestion d'exceptions.

#### 🌟 Fonctionnalités

- **Gestion des animaux** : Ajout d'animaux terrestres et aquatiques
- **Validation d'âge** : Exception levée si l'âge de l'animal est négatif (`InvalidAgeException`)
- **Capacité du zoo** : Exception levée si le zoo atteint sa capacité maximale (`ZooFullException`)
- **Hiérarchie d'animaux** : Support pour différents types d'animaux (Dauphins, Pingouins, etc.)

#### 📂 Structure

```
Prosit1/
├── src/
│   └── zoo/
│       ├── entities/
│       │   ├── Animal.java
│       │   ├── Aquatic.java
│       │   ├── Terrestrial.java
│       │   ├── Dolphin.java
│       │   ├── Penguin.java
│       │   ├── Zoo.java
│       │   ├── ZooFullException.java
│       │   └── InvalidAgeException.java
│       └── management/
│           └── ZooManagement.java
```

#### 💻 Exemple d'utilisation

```java
Zoo zoo = new Zoo("Belvédère", "Tunis");
Animal lion = new Animal("Félin", "Lion", 5, true);

try {
    zoo.addAnimal(lion);
    System.out.println("Animal ajouté avec succès !");
} catch (ZooFullException | InvalidAgeException e) {
    System.out.println("Erreur : " + e.getMessage());
}
```

#### ⚠️ Exceptions gérées

- `InvalidAgeException` : Levée lorsque l'âge de l'animal est négatif
- `ZooFullException` : Levée lorsque le zoo a atteint sa capacité maximale (3 animaux)

---

### Prosit8 - Système de Gestion d'Employés

Un système de gestion d'employés utilisant des ArrayList avec des fonctionnalités de tri et recherche avancées.

#### 🌟 Fonctionnalités

- **Gestion CRUD** : Ajout, recherche, suppression et affichage d'employés
- **Tri multiple** :
  - Tri par ID (ordre naturel)
  - Tri par département, grade et nom
- **Recherche avancée** : Recherche par nom ou par département
- **Implémentation d'interfaces** : `IGestion` et `IRechercheAvancee`

#### 📂 Structure

```
prosit8/
├── src/
│   ├── Employe.java
│   ├── IGestion.java
│   ├── IRechercheAvancee.java
│   ├── SocieteArrayList.java
│   └── Main.java
```

#### 💻 Exemple d'utilisation

```java
SocieteArrayList societe = new SocieteArrayList();

// Ajout d'employés
Employe e1 = new Employe(1, "Ali", "Ben Salah", "IT", 3);
societe.ajouterEmploye(e1);

// Recherche par nom
boolean trouve = societe.rechercherEmploye("Ali");

// Tri par ID
societe.trierEmployeParId();

// Tri par département, grade et nom
societe.trierEmployeParNomDépartementEtGrade();

// Recherche par département
List<Employe> employesIT = societe.rechercherParDepartement("IT");
```

#### 🔍 Méthodes disponibles

| Méthode | Description |
|---------|-------------|
| `ajouterEmploye(Employe e)` | Ajoute un employé à la liste |
| `rechercherEmploye(String nom)` | Recherche un employé par nom |
| `supprimerEmploye(Employe e)` | Supprime un employé |
| `displayEmploye()` | Affiche tous les employés |
| `trierEmployeParId()` | Tri par ID |
| `trierEmployeParNomDépartementEtGrade()` | Tri par département, grade et nom |
| `rechercherParDepartement(String dept)` | Recherche tous les employés d'un département |

---

## 🛠️ Prérequis

- **Java JDK** 8 ou supérieur
- Un IDE Java (IntelliJ IDEA, Eclipse, NetBeans, ou VS Code)

## 📥 Installation

1. Clonez le dépôt :
```bash
git clone https://github.com/Azer-khadhraoui/java-3A.git
cd java-3A
```

2. Ouvrez l'un des projets dans votre IDE :
   - `Prosit1` pour le système de gestion de zoo
   - `prosit8` pour le système de gestion d'employés

## ▶️ Utilisation

### Compiler et exécuter Prosit1 (Zoo Management)

```bash
cd Prosit1/src
javac zoo/management/ZooManagement.java
java zoo.management.ZooManagement
```

### Compiler et exécuter Prosit8 (Employee Management)

```bash
cd prosit8/src
javac Main.java
java Main
```

## 📁 Structure du Projet

```
java-3A/
├── Prosit1/              # Projet de gestion de zoo
│   ├── .gitignore
│   ├── Prosit1.iml
│   └── src/
│       └── zoo/
│           ├── entities/      # Classes d'entités
│           └── management/    # Classes de gestion
│
├── prosit8/              # Projet de gestion d'employés
│   ├── .gitignore
│   ├── prosit8.iml
│   └── src/
│       ├── Employe.java
│       ├── IGestion.java
│       ├── IRechercheAvancee.java
│       ├── SocieteArrayList.java
│       └── Main.java
│
└── README.md             # Ce fichier
```

## 🎓 Concepts Java Illustrés

### Prosit1
- ✅ Gestion des exceptions personnalisées
- ✅ Héritage et polymorphisme
- ✅ Encapsulation
- ✅ Validation de données

### Prosit8
- ✅ Interfaces et implémentation
- ✅ Génériques (`IGestion<T>`)
- ✅ Collections (ArrayList)
- ✅ Comparable et Comparator
- ✅ Tri et recherche dans les collections

## 👤 Auteur

**Azer Khadhraoui**

## 📝 Licence

Ce projet est développé dans un cadre éducatif.
