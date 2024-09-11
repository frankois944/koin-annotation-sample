import SwiftUI
import shared

@main
struct iOSApp: App {
    
    init() {
        StartKoinKt.startApp()
    }
    
	var body: some Scene {
		WindowGroup {
			ContentView()
		}
	}
}
