import {
  View,
  Text,
  Image,
  Dimensions,
  SafeAreaView,
  StyleSheet,
  TouchableOpacity,
  Pressable,
  FlatList,
  Button,
  NativeModules,
} from 'react-native';
import Video, {VideoProperties} from 'react-native-video';
import React, {useRef, useState, useEffect} from 'react';
import imagepath from './constants/imagepath';
import ViewMoreText from 'react-native-view-more-text';


const {Version, SDKVersion, Media} = NativeModules;

const {height, width} = Dimensions.get('window');

/* const videodata: VideoItem[] = [
  {
    url: 'http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4',
    id: 'Big Buck Bunny',
  },
  {
    url: 'http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ElephantsDream.mp4',
    id: 'Elephant Dream',
  },
  {
    url: 'http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerBlazes.mp4',
    id: 'For Bigger Blazes',
  },
  {
    url: 'http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerEscapes.mp4',
    id: 'For Bigger Escape',
  },
  {
    url: 'http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerFun.mp4',
    id: 'For Bigger Fun',
  }, */


/* const VideoListItem = ({item}: {item: VideoItem}) => {
  const [paused, setPaused] = useState(true);
  const videoRef = useRef<Video>(null);

  const handlePlayPause = () => {
    if (videoRef.current) {
      if (paused) {
        videoRef.current.play();
      } else {
        videoRef.current.pause();
      }
      setPaused(!paused);
    }
  };

  const handleVideoEnd = () => {
    if (videoRef.current) {
      videoRef.current.seek(0);
      setPaused(true);
    }
  };

  return (
    <View style={styles.videoContainer}>
      <TouchableOpacity onPress={handlePlayPause}>
        <Video
          ref={videoRef}
          source={{uri: item.url}}
          style={styles.video}
          resizeMode="contain"
          paused={paused}
          onEnd={handleVideoEnd}
        />
        {!paused && <Text style={styles.pauseOverlay}>PAUSED</Text>}
      </TouchableOpacity>
    </View>
  );
}; */

const App = () => {

  const onBuffer = (e: any) => {
    console.log('buffering', e);
  };
  const onError = (e: any) => {
    console.log('error', e);
  };
  const onPress = () => {
    Version.getVersion();
    SDKVersion.VVersion();
    Media.MediaCall();
  };

  return (
    

      <View style={{flex: 1, backgroundColor: 'gray'}}>
        <Video
          source={{
            uri: 'https://assets.mixkit.co/videos/preview/mixkit-two-avenues-with-many-cars-traveling-at-night-34562-large.mp4',
          }}
          poster={
            'https://w0.peakpx.com/wallpaper/1000/403/HD-wallpaper-vertical-waves-sea-water.jpg'
          }
         // ref={VideoRef}
          onBuffer={onBuffer}
          resizeMode="cover"
          onError={onError}
          repeat={true}
          paused={false}
          style={styles.backgroundVideo}></Video>

        <SafeAreaView>
          <View style={styles.flexHorizontal}>
            <Text style={styles.textStyle}>VideoShorts</Text>
            <Image
              style={{alignItems: 'flex-end'}}
              source={imagepath.videoicon}></Image>
          </View>
        </SafeAreaView>

        <View style={styles.bottomView}>
          <View style={{flexDirection: 'row', alignItems: 'center'}}>
            <Image source={require('../Twelve/icons/profileicon.png')} />
            <Text style={{marginHorizontal: 8, fontSize: 16, color: 'white'}}>
              Profile Name
            </Text>
            <TouchableOpacity>
              <Text style={{marginHorizontal: 8, color: 'white'}}> Follow</Text>
            </TouchableOpacity>
          </View>

          <View>
            <Pressable style={styles.button} onPress={onPress}>
              <Text>Call from NativeModule</Text>
            </Pressable>
          </View>

          <ViewMoreText
            numberOfLines={1}
            renderViewMore={this.renderViewMore}
            renderViewLess={this.renderViewLess}
            textStyle={{textAlign: 'center'}}>
            <Text
              style={{
                marginHorizontal: 5,
                color: 'white',
                textAlign: 'justify',
                justifyContent: 'flex-start',
              }}>
              Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
              eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut
              enim ad minim veniam, quis nostrud exercitation ullamco laboris
              nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in
              reprehenderit in voluptate velit esse cillum dolore eu fugiat
              nulla pariatur. Excepteur sint occaecat cupidatat non proident,
              sunt in culpa qui officia deserunt mollit anim id est laborum.{' '}
            </Text>
          </ViewMoreText>

          <View>
            <View
              style={{
                flexDirection: 'row',
                alignContent: 'center',
                alignItems: 'flex-end',
              }}>
              <TouchableOpacity>
                <Image source={imagepath.likebutton}></Image>
              </TouchableOpacity>
              <TouchableOpacity>
                <Image source={imagepath.dislikebutton}></Image>
              </TouchableOpacity>
              <TouchableOpacity>
                <Image source={imagepath.commentsbutton}></Image>
              </TouchableOpacity>
              <TouchableOpacity>
                <Image source={imagepath.morebutton}></Image>
              </TouchableOpacity>
            </View>
          </View>
        </View>
      </View>
    
  );
}

const styles = StyleSheet.create({
  backgroundVideo: {
    position: 'absolute',
    height: height,
    width: width,
  },
  flexHorizontal: {
    flexDirection: 'row',
    alignItems: 'center',
    justifyContent: 'space-between',
  },
  textStyle: {
    fontSize: 25,
    fontWeight: 'bold',
    color: 'white',
    paddingLeft: 10,
    alignContent: 'flex-start',
  },
  metastyles: {
    fontsize: 16,
    color: 'white',
    flex: 1,
    width: 50,
    height: 50,
    resizeMode: 'contain',
  },
  topSafeArea: {
    flex: 0,
    backgroundColor: '#000000',
  },
  bottomSafeArea: {
    flex: 1,
    backgroundColor: '#8080ff',
  },
  bottomView: {
    flex: 1,
    justifyContent: 'flex-end',
    paddingVertical: 40,
    paddingHorizontal: 16,
  },
  item: {
    backgroundColor: '#f9c2ff',
    padding: 20,
    marginVertical: 8,
    marginHorizontal: 16,
  },
  title: {
    fontSize: 32,
  },
  button: {
    alignItems: 'center',
    justifyContent: 'center',
    paddingVertical: 12,
    paddingHorizontal: 32,
    borderRadius: 4,
    elevation: 3,
    backgroundColor: 'white',
  },
  videoContainer: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    height: 200,
    marginBottom: 10,
  },
  video: {
    flex: 1,
    alignSelf: 'stretch',
  },
});
export default App;