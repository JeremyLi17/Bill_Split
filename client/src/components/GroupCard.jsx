import React from 'react';
import styled from 'styled-components';

const Container = styled.div`
  font-weight: 500;
  font-size: 20px;
  padding-bottom: 10px;
  cursor: pointer;
`;

const Hr = styled.hr`
  margin: 15px 0px;
  border: 0.5px solid lightgray;
`;

const GroupCard = ({ groupName }) => {
  return (
    <Container>
      {groupName}
      <Hr></Hr>
    </Container>
  );
};

export default GroupCard;
