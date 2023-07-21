# Roam-Air
Roam Air screen software we have a DriveMode class that controls the riding behavior/mode of our electric motorcycles.

Roam Air Screen is a software application that controls the riding behavior/mode of our electric motorcycles. With this software, riders can select from various riding modes to suit their preferences and road conditions. Currently, it supports one riding mode style, but we plan to add three more exciting riding modes: ECO, SPORT, and OFF-ROAD.

## Getting Started

To use the Roam Air Screen Software, follow these steps:

1. Clone the repository to your local machine.
2. Install the required dependencies.
3. Run the software on your motorcycle's display system.

## Usage

Once the software is running on your motorcycle's screen, you can navigate through the available riding modes and select the one that suits your riding style.

### Switching Riding Modes

To switch to a different riding mode:

1. Go to the main menu on the Roam Air Screen.
2. Select the "Riding Mode" option.
3. Choose one of the following modes: ECO, SPORT, or OFF-ROAD.

## Adding New Riding Modes

If you wish to add new riding modes to the software, you can do so by extending the `DriverControl` class.

1. Create a new class for your riding mode (e.g., `EcoMode`) and inherit from the `RideMode` base class.
2. Override the `drive()` method in your new class with the specific behavior for your mode.
3. Update the `DriverControl` class to include a method for switching to your new mode.
4. Enjoy your custom riding mode in the Roam Air Screen Software!

## Contributing

We welcome contributions to enhance the Roam Air Screen Software. If you have any ideas, bug fixes, or new features to add, feel free to open a pull request. Together, let's make riding electric motorcycles an even more enjoyable experience!

## License

This software is licensed under the [MIT License](LICENSE).
