import React from 'react';
import {Button} from 'react-native';
import CalendarModule from './CalendarModule';

const NewModuleButton = () => {
  const onPress = async () => {
    try {
      const eventId = await CalendarModule.createCalendarEvent(
        'Party',
        'My House',
      );
      console.log(`Created a new event with id ${eventId}`);
    } catch (e) {
      console.error(e);
    }
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
