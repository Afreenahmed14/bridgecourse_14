sunlight = True
battery_full = False

if sunlight and not battery_full:
    print("Charge the battery using solar power")

if battery_full:
    print("Stop charging, battery is full")

if not sunlight:
    print("No charging, switch to backup power")
