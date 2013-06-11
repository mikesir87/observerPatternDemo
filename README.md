# Observer Demonstration

## Running in Eclipse

1. Clone the repository
2. In Eclipse, go to **File** -> **Import** -> **General** -> **Existing Projects into Workspace**
3. Select the directory and finish the import.
4. To run any, right-click on the Main you wish to run -> **Run as...** -> **Java Application**.
5. In the Console view, type in any value and press Enter.
6. When you're done, type **exit**

## The application

This app serves as demonstration on why the Observer pattern is useful.  When started, the app reads input from the console and hands the data off to various other objects.  Those objects can do whatever they want with that data.  In most cases in this demo, they System.out some modified version of the inputted data (such as scrambling, reversing, etc.).

### The demo.plain package

The *Main* in the **demo.plain** package creates the *ConsoleReader*, who creates each of the things it thinks should listen to it.  When data is read from the console, it passes this data to those constructed objects.

What's wrong with this?  The *ConsoleReader* is now coupled to each of the the objects it creates and doesn't allow for any outside modification to who can act on the inputted data.  The *ConsoleReader* cannot be used in other projects without either bringing the classes it tries to construct or changing the code.  It's just not reusable. :(

### The demo.observer package

The **demo.observer** package introduces the notion of an Observer, or listener. Each of the objects that were responding to input now become listeners by implementing the *StringTypedListener* interface.

The Main in the **demo.observer** package creates the *ConsoleReader*.  It then creates each listener and registers it with the *ConsoleReader*. The *ConsoleReader* no longer needs to construct any of these objects, allowing it to be re-usable. It doesn't care who receives notifications of the inputted text, so by adding in the listening support (the *StringsTypedListeningService* interface), the *ConsoleReader* is now flexible in adding and removing listeners at any point.

One advantage of this flexibility is that listeners can be added and removed at any point.  The *ListeningMain* class is a listener itself and listens for **toggle** to be typed.  When it is typed, it toggles whether the Scrambler listener should be listening.
