import styled from 'styled-components';
import LoginOutlinedIcon from '@mui/icons-material/LoginOutlined';
import PersonAddAltOutlinedIcon from '@mui/icons-material/PersonAddAltOutlined';
import SearchOutlinedIcon from '@mui/icons-material/SearchOutlined';
import { Link } from 'react-router-dom';

const Container = styled.div`
  position: sticky;
  top: 0;
  height: 56px;
`;

const Wrapper = styled.div`
  display: flex;
  align-items: center;
  justify-content: space-between;
  height: 100%;
  padding: 0px 20px;
  position: relative;
  background-color: #a8a8a8;
`;

const Title = styled.h1`
  cursor: pointer;
`;

const Search = styled.div`
  width: 40%;
  position: absolute;
  /* put the compoent in the middle */
  left: 0px;
  right: 0px;
  margin: auto;
  display: flex;
  align-items: center;
  justify-content: space-between;
  padding: 5px;
  border: 1px solid #ccc;
  border-radius: 3px;
`;

const Input = styled.input`
  width: 100%;
  border: none;
  background-color: transparent;
  outline: none;
`;

const Buttons = styled.div`
  display: flex;
  align-items: center;
  gap: 20px;
`;

const Button = styled.div`
  display: flex;
  align-items: center;
  gap: 10px;
  cursor: pointer;
  border-radius: 3px;
  background-color: #7fdbff;
  padding: 8px 5px;
`;

const Navbar = () => {
  return (
    <Container>
      <Wrapper>
        <Link to="/" style={{ textDecoration: 'none', color: 'inherit' }}>
          <Title>Bill Split</Title>
        </Link>
        <Search>
          <Input placeholder="Search for group" />
          <SearchOutlinedIcon style={{ cursor: 'pointer' }} />
        </Search>
        <Buttons>
          <Link
            to="/login"
            style={{ textDecoration: 'none', color: 'inherit' }}
          >
            <Button>
              <LoginOutlinedIcon />
              Login
            </Button>
          </Link>
          <Link
            to="/register"
            style={{ textDecoration: 'none', color: 'inherit' }}
          >
            <Button>
              <PersonAddAltOutlinedIcon />
              Register
            </Button>
          </Link>
        </Buttons>
      </Wrapper>
    </Container>
  );
};

export default Navbar;
