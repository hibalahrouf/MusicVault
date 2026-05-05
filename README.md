# 🎵 MusicVault — Laboratoire Navigation Drawer

## 📋 Description

Une application Android démontrant le modèle **Navigation Drawer** avec la gestion dynamique des fragments via `FragmentManager`.

---

## 📸 Demo


---

## 🏗️ Structure du projet

```
com.example.musicvault/
├── MainActivity.java             → Héberge le drawer + gère la navigation
├── HomeFragment.java             → Fragment 1 (fond violet)
├── TrendingFragment.java         → Fragment 2 (fond orange)
├── ArtistListFragment.java       → Fragment 3 (liste d'artistes)
│
res/
├── layout/
│   ├── activity_main.xml         → Mise en page racine avec DrawerLayout
│   ├── content_main.xml          → Conteneur FrameLayout (id: contenu)
│   ├── fragment_home.xml         → Interface écran accueil violet
│   └── fragment_trending.xml     → Interface écran tendances orange
├── menu/
│   └── activity_main_drawer.xml  → 3 éléments du menu drawer
└── drawable/
    ├── ic_home.xml
    ├── ic_trending.xml
    └── ic_artists.xml
```

---

## ⚙️ Fonctionnalités

- Navigation Drawer avec 3 éléments de menu
- Changement dynamique de fragments via `FragmentManager`
- Fragment par défaut chargé au démarrage (`HomeFragment`)
- Le bouton retour ferme le drawer s'il est ouvert
- Couleurs personnalisées par fragment

---

## 🧭 Flux de navigation

```
Lancement de l'app
    └── HomeFragment (par défaut)

Drawer → Accueil     →  HomeFragment         (violet #4A148C)
Drawer → Tendances   →  TrendingFragment     (orange #FF6F00)
Drawer → Artistes    →  ArtistListFragment   (liste de 10 artistes)
```

---

## 🎤 Liste des artistes

Le `ArtistListFragment` affiche les artistes suivants :

1. The Weeknd
2. Dua Lipa
3. Drake
4. Billie Eilish
5. Post Malone
6. Ariana Grande
7. Kendrick Lamar
8. Taylor Swift
9. Bad Bunny
10. SZA





---

## 📚 Concepts clés appris

| Concept | Description |
|---|---|
| `DrawerLayout` | Mise en page racine qui active le tiroir latéral |
| `NavigationView` | Le panneau drawer avec les éléments du menu |
| `FragmentManager` | Gère les transactions de fragments |
| `.replace()` | Remplace un fragment par un autre |
| `.commit()` | Valide la transaction de fragment |
| `closeDrawer()` | Ferme le drawer après sélection d'un élément |

---



