import styled from 'styled-components';
import Avatar from '../components/Avatar';
import GroupList from '../components/GroupList';
import Info from '../components/Info';

const Container = styled.div`
  display: flex;
`;

const Wrapper = styled.div`
  flex: 8;
  padding: 22px 44px;
  display: flex;
  flex-direction: column;
  text-align: center;
`;

const Home = () => {
  return (
    <Container>
      <GroupList />
      <Wrapper>
        <Avatar />
        <Info />
      </Wrapper>
    </Container>
  );
};

export default Home;
