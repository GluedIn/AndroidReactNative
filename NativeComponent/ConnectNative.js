import {NativeModules, Platform} from 'react-native';

const Navigation = NativeModules.NavigationModule

const ConnectNative = {
   
    launchNoCode: msg => {
        if (Platform.OS === 'android') {
            Navigation.navigateToNative();
        }
    },

    launchNoCodeArabic: msg => {
        if (Platform.OS === 'android') {
            Navigation.navigateToNativeArabic();
        }
    },
};

export default ConnectNative;