# PrésenceManager 📱

## 📌 Description du Projet
**PrésenceManager** est une application mobile Android native conçue pour faciliter la gestion de la présence des stagiaires au sein des établissements de formation. 

Ce projet regroupe l'ensemble des Travaux Pratiques (**TP01**, **TP02**, **TP03**, **TP04** et **TP05**) du module **M205 — Développer des interfaces utilisateurs sous Android** (Filière Développement Digital).

---

## 🎯 Objectifs du TP05 — Listes et Adaptateurs (`ListView`, `ArrayAdapter`, `BaseAdapter`)
Implémentation de listes dynamiques et personnalisées en Kotlin :
1. **Liste simple (`ArrayAdapter`)** :
   - Affichage d'une liste simple des groupes (`DEVAM201` à `DEVAM210`) via `ArrayAdapter` et `android.R.layout.simple_list_item_1`.
2. **Liste personnalisée (`BaseAdapter` & `ViewHolder`)** :
   - Affichage d'une liste personnalisée avec icône et nombre de stagiaires par groupe en utilisant un `BaseAdapter` optimisé avec le pattern `ViewHolder` et un layout personnalisé (`item_groupe.xml`).
3. **Gestion des clics** :
   - Clic sur les boutons de basculement entre `ArrayAdapter` et `BaseAdapter`.
   - Clic sur un groupe de la liste pour afficher une boîte de dialogue (`AlertDialog`) contenant les détails du groupe (nom et nombre de stagiaires).

---

## 🛠️ Langages, Outils et Technologies Utilisés

### 🔤 1. Langages de Programmation
* **Kotlin** : Logique applicative, gestion des adaptateurs personnalisés (`BaseAdapter`), data classes et gestion des clics.
* **XML (Extensible Markup Language)** : Layouts des vues (`activity_groupes.xml`, `item_groupe.xml`).
* **Markdown** : Documentation complète du projet (`README.md`).

### 🧰 2. Environnement et Outils de Développement
* **Android Studio** : IDE officiel Android.
* **Gradle** : System Automation Build.

### ⚙️ 3. Composants et APIs Android Framework
* **`ListView`** : Affichage de listes défilantes.
* **`ArrayAdapter`** : Adaptateur pour listes textuelles simples.
* **`BaseAdapter` & `ViewHolder`** : Adaptateur personnalisé et recyclage de vues.
* **`AlertDialog.Builder`** : Affichage des détails d'un groupe sélectionné.

---

## 📱 Description Détaillée des Écrans et TP05

### 1️⃣ Écran des Groupes (`GroupesActivity`)
- Permet de basculer entre l'affichage en liste simple (`ArrayAdapter`) et l'affichage en liste personnalisée (`BaseAdapter`).
- Gère le clic sur les éléments pour afficher les informations détaillées du groupe.

---

## 👨‍💻 Auteur & Informations
* **Module** : M205 — Développer des interfaces utilisateurs sous Android
* **Développeur** : Omar Bencheikh
* **Version** : 1.1
* **Dépôt GitHub** : [PresenceManager sur GitHub](https://github.com/bencheikhomar/presencemanager)
