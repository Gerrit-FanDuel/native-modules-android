import React from 'react';
import {Button} from 'react-native';
import CalendarModule from './CalendarModule';

const NewModuleButton = () => {
  const onPress = () => {
    CalendarModule.createCalendarEvent(
      'Party',
      'My House',
      error => {
        console.error(`Error found! ${error}`);
      },
      eventId => {
        console.log(`event id ${eventId} returned`);
      },
    );
  };

  const {DEFAULT_EVENT_NAME} = CalendarModule.getConstants();
  console.log({DEFAULT_EVENT_NAME});

  return (
    <Button
      title="Click to invoke your native module!"
      color="#841584"
      onPress={onPress}
    />
  );
};

export default NewModuleButton;
